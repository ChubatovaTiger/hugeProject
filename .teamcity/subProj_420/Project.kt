package subProj_420

import subProj_420.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_420")
    name = "subProj 420"

    buildType(subProj_bt_420_3)
    buildType(subProj_bt_420_2)
    buildType(subProj_bt_420_5)
    buildType(subProj_bt_420_4)
    buildType(subProj_bt_420_1)
    buildType(subProj_bt_420_0)
})
