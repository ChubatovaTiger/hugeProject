package subProj_329

import subProj_329.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_329")
    name = "subProj 329"

    buildType(subProj_bt_329_1)
    buildType(subProj_bt_329_0)
    buildType(subProj_bt_329_5)
    buildType(subProj_bt_329_4)
    buildType(subProj_bt_329_3)
    buildType(subProj_bt_329_2)
})
