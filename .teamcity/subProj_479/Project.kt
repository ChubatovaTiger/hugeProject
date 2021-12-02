package subProj_479

import subProj_479.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_479")
    name = "subProj 479"

    buildType(subProj_bt_479_1)
    buildType(subProj_bt_479_0)
    buildType(subProj_bt_479_5)
    buildType(subProj_bt_479_4)
    buildType(subProj_bt_479_3)
    buildType(subProj_bt_479_2)
})
