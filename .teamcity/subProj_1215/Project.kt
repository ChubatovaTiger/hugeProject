package subProj_1215

import subProj_1215.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1215")
    name = "subProj 1215"

    buildType(subProj_bt_1215_5)
    buildType(subProj_bt_1215_4)
    buildType(subProj_bt_1215_3)
    buildType(subProj_bt_1215_2)
    buildType(subProj_bt_1215_1)
    buildType(subProj_bt_1215_0)
})
