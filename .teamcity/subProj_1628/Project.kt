package subProj_1628

import subProj_1628.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1628")
    name = "subProj 1628"

    buildType(subProj_bt_1628_0)
    buildType(subProj_bt_1628_1)
    buildType(subProj_bt_1628_2)
    buildType(subProj_bt_1628_3)
    buildType(subProj_bt_1628_4)
    buildType(subProj_bt_1628_5)
})
