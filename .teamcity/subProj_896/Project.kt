package subProj_896

import subProj_896.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_896")
    name = "subProj 896"

    buildType(subProj_bt_896_3)
    buildType(subProj_bt_896_4)
    buildType(subProj_bt_896_5)
    buildType(subProj_bt_896_0)
    buildType(subProj_bt_896_1)
    buildType(subProj_bt_896_2)
})
