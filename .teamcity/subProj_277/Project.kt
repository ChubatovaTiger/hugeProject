package subProj_277

import subProj_277.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_277")
    name = "subProj 277"

    buildType(subProj_bt_277_5)
    buildType(subProj_bt_277_4)
    buildType(subProj_bt_277_3)
    buildType(subProj_bt_277_2)
    buildType(subProj_bt_277_1)
    buildType(subProj_bt_277_0)
})
