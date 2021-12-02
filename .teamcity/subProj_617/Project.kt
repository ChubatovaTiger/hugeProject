package subProj_617

import subProj_617.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_617")
    name = "subProj 617"

    buildType(subProj_bt_617_5)
    buildType(subProj_bt_617_4)
    buildType(subProj_bt_617_1)
    buildType(subProj_bt_617_0)
    buildType(subProj_bt_617_3)
    buildType(subProj_bt_617_2)
})
