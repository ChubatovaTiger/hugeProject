package subProj_363

import subProj_363.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_363")
    name = "subProj 363"

    buildType(subProj_bt_363_5)
    buildType(subProj_bt_363_4)
    buildType(subProj_bt_363_1)
    buildType(subProj_bt_363_0)
    buildType(subProj_bt_363_3)
    buildType(subProj_bt_363_2)
})
