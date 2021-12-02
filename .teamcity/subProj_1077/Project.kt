package subProj_1077

import subProj_1077.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1077")
    name = "subProj 1077"

    buildType(subProj_bt_1077_5)
    buildType(subProj_bt_1077_3)
    buildType(subProj_bt_1077_4)
    buildType(subProj_bt_1077_1)
    buildType(subProj_bt_1077_2)
    buildType(subProj_bt_1077_0)
})
