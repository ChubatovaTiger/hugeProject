package subProj_950

import subProj_950.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_950")
    name = "subProj 950"

    buildType(subProj_bt_950_1)
    buildType(subProj_bt_950_0)
    buildType(subProj_bt_950_3)
    buildType(subProj_bt_950_2)
    buildType(subProj_bt_950_5)
    buildType(subProj_bt_950_4)
})
