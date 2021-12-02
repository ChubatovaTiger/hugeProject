package subProj_1371

import subProj_1371.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1371")
    name = "subProj 1371"

    buildType(subProj_bt_1371_0)
    buildType(subProj_bt_1371_1)
    buildType(subProj_bt_1371_2)
    buildType(subProj_bt_1371_3)
    buildType(subProj_bt_1371_4)
    buildType(subProj_bt_1371_5)
})
