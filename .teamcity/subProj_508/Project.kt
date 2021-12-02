package subProj_508

import subProj_508.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_508")
    name = "subProj 508"

    buildType(subProj_bt_508_5)
    buildType(subProj_bt_508_3)
    buildType(subProj_bt_508_4)
    buildType(subProj_bt_508_1)
    buildType(subProj_bt_508_2)
    buildType(subProj_bt_508_0)
})
