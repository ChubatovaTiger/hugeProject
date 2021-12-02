package subProj_1137

import subProj_1137.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1137")
    name = "subProj 1137"

    buildType(subProj_bt_1137_0)
    buildType(subProj_bt_1137_1)
    buildType(subProj_bt_1137_4)
    buildType(subProj_bt_1137_5)
    buildType(subProj_bt_1137_2)
    buildType(subProj_bt_1137_3)
})
