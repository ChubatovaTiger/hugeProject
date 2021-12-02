package subProj_1896

import subProj_1896.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1896")
    name = "subProj 1896"

    buildType(subProj_bt_1896_5)
    buildType(subProj_bt_1896_4)
    buildType(subProj_bt_1896_3)
    buildType(subProj_bt_1896_2)
    buildType(subProj_bt_1896_1)
    buildType(subProj_bt_1896_0)
})
