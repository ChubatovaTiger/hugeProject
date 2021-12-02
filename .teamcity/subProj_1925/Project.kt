package subProj_1925

import subProj_1925.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1925")
    name = "subProj 1925"

    buildType(subProj_bt_1925_1)
    buildType(subProj_bt_1925_2)
    buildType(subProj_bt_1925_0)
    buildType(subProj_bt_1925_5)
    buildType(subProj_bt_1925_3)
    buildType(subProj_bt_1925_4)
})
