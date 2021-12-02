package subProj_925

import subProj_925.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_925")
    name = "subProj 925"

    buildType(subProj_bt_925_5)
    buildType(subProj_bt_925_4)
    buildType(subProj_bt_925_3)
    buildType(subProj_bt_925_2)
    buildType(subProj_bt_925_1)
    buildType(subProj_bt_925_0)
})
