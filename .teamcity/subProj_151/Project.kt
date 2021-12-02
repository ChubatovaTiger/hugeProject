package subProj_151

import subProj_151.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_151")
    name = "subProj 151"

    buildType(subProj_bt_151_0)
    buildType(subProj_bt_151_1)
    buildType(subProj_bt_151_2)
    buildType(subProj_bt_151_3)
    buildType(subProj_bt_151_4)
    buildType(subProj_bt_151_5)
})
