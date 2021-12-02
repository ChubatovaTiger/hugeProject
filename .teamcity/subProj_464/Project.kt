package subProj_464

import subProj_464.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_464")
    name = "subProj 464"

    buildType(subProj_bt_464_5)
    buildType(subProj_bt_464_4)
    buildType(subProj_bt_464_3)
    buildType(subProj_bt_464_2)
    buildType(subProj_bt_464_1)
    buildType(subProj_bt_464_0)
})
