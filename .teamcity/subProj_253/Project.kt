package subProj_253

import subProj_253.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_253")
    name = "subProj 253"

    buildType(subProj_bt_253_4)
    buildType(subProj_bt_253_5)
    buildType(subProj_bt_253_2)
    buildType(subProj_bt_253_3)
    buildType(subProj_bt_253_0)
    buildType(subProj_bt_253_1)
})
