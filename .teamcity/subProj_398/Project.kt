package subProj_398

import subProj_398.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_398")
    name = "subProj 398"

    buildType(subProj_bt_398_4)
    buildType(subProj_bt_398_5)
    buildType(subProj_bt_398_2)
    buildType(subProj_bt_398_3)
    buildType(subProj_bt_398_0)
    buildType(subProj_bt_398_1)
})
