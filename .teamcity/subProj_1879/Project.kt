package subProj_1879

import subProj_1879.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1879")
    name = "subProj 1879"

    buildType(subProj_bt_1879_0)
    buildType(subProj_bt_1879_5)
    buildType(subProj_bt_1879_3)
    buildType(subProj_bt_1879_4)
    buildType(subProj_bt_1879_1)
    buildType(subProj_bt_1879_2)
})
