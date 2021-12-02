package subProj_1906

import subProj_1906.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1906")
    name = "subProj 1906"

    buildType(subProj_bt_1906_5)
    buildType(subProj_bt_1906_4)
    buildType(subProj_bt_1906_1)
    buildType(subProj_bt_1906_0)
    buildType(subProj_bt_1906_3)
    buildType(subProj_bt_1906_2)
})
