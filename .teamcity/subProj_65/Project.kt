package subProj_65

import subProj_65.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_65")
    name = "subProj 65"

    buildType(subProj_bt_65_1)
    buildType(subProj_bt_65_2)
    buildType(subProj_bt_65_0)
    buildType(subProj_bt_65_5)
    buildType(subProj_bt_65_3)
    buildType(subProj_bt_65_4)
})
