package subProj_849

import subProj_849.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_849")
    name = "subProj 849"

    buildType(subProj_bt_849_1)
    buildType(subProj_bt_849_2)
    buildType(subProj_bt_849_0)
    buildType(subProj_bt_849_5)
    buildType(subProj_bt_849_3)
    buildType(subProj_bt_849_4)
})
