package subProj_532

import subProj_532.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_532")
    name = "subProj 532"

    buildType(subProj_bt_532_5)
    buildType(subProj_bt_532_4)
    buildType(subProj_bt_532_3)
    buildType(subProj_bt_532_2)
    buildType(subProj_bt_532_1)
    buildType(subProj_bt_532_0)
})
