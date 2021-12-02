package subProj_628

import subProj_628.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_628")
    name = "subProj 628"

    buildType(subProj_bt_628_5)
    buildType(subProj_bt_628_4)
    buildType(subProj_bt_628_1)
    buildType(subProj_bt_628_0)
    buildType(subProj_bt_628_3)
    buildType(subProj_bt_628_2)
})
