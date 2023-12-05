package com.example.viso.service.impl;

import com.example.viso.entity.SunburstEntity;
import com.example.viso.mapper.SunburstMapper;
import com.example.viso.service.ISunburstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SunburstServiceImpl implements ISunburstService {
    private String[] physics={"physics","astro-ph","cond-mat","gr-qc","hep-ex","hep-lat",
            "hep-ph","math-ph","nlin","nucl-ex","physics","quant-ph"};
    private String[] mathematics={"mathematics", "math.GR", "math.NA", "math.KT", "math.QA", "math.NT", "math.AC", "math.OA", "math.MP", "math.GT", "math.DG",
            "math.GM", "math.RT", "math.AT", "math.CV", "math.FA", "math.IT", "math.GN", "math.CT", "math.LO", "math.RA",
            "math.AP", "math.DS", "math.OC", "math.AG", "math.SP", "math.CA", "math.PR", "math.SG", "math.MG", "math.ST",
            "math.CO", "math.HO", "q-alg", "alg-geom", "funct-an", "dg-ga"};
    private String[] computer_science={"computer_science","cs.ET", "cs.DB", "cs.IR", "cs.CL", "cs.DL", "cs.LG", "cs.SC", "cs.NA", "cs.SD", "cs.DM", "cs.LO", "cs.DC", "cs.DS",
            "cs.HC", "cs.RO", "cs.OS", "cs.OS", "cs.CE", "cs.CR", "cs.NI", "cs.CY", "cs.FL", "cs.MM", "cs.AR", "cs.IT", "cs.AI",
            "cs.OH", "cs.SY", "cs.GR", "cs.CV", "cs.MA", "cs.CG", "cs.MS", "cs.SE", "cs.SI", "cs.GL", "cs.GT", "cs.NE", "cs.CC",
            "cs.PL", "cs.PF", "cmp-lg"};

    private String[] quantitative_biology={"quantitative_biology","q-bio.CB", "q-bio.BM", "q-bio.NC", "q-bio.QM", "q-bio", "q-bio.GN", "q-bio.PE", "q-bio.SC", "q-bio.MN", "q-bio.TO",
            "q-bio.OT"};

    private String[] quantitative_finance={"quantitative_finance","q-fin.MF", "q-fin.GN", "q-fin.PR", "q-fin.ST", "q-fin.PM", "q-fin.TR", "q-fin.RM", "q-fin.CP", "q-fin.CP"};
    private String[] Statistics={"Statistics","stat.OT", "stat.TH", "stat.ML", "stat.ME", "stat.CO", "stat.AP"};
    private String[] electrical_engineering_and_systems_science={"electrical_engineering_and_systems_science","eess.SP", "eess.IV", "eess.SY", "eess.AS"};

    private String[] economics={"economics","econ.EM", "econ.GN", "econ.TH"};


    @Autowired
    private SunburstMapper mapper;
    @Override
    public List<SunburstEntity> selectSun() {
        List<SunburstEntity> list=mapper.selectSun();

        return list;
    }
}
