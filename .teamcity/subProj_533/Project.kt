package subProj_533

import subProj_533.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_533")
    name = "subProj 533"

    buildType(subProj_bt_533_5)
    buildType(subProj_bt_533_4)
    buildType(subProj_bt_533_3)
    buildType(subProj_bt_533_2)
    buildType(subProj_bt_533_1)
    buildType(subProj_bt_533_0)
})
