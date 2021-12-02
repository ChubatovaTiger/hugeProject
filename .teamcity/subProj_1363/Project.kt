package subProj_1363

import subProj_1363.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1363")
    name = "subProj 1363"

    buildType(subProj_bt_1363_2)
    buildType(subProj_bt_1363_1)
    buildType(subProj_bt_1363_0)
    buildType(subProj_bt_1363_5)
    buildType(subProj_bt_1363_4)
    buildType(subProj_bt_1363_3)
})
