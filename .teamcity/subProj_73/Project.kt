package subProj_73

import subProj_73.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_73")
    name = "subProj 73"

    buildType(subProj_bt_73_0)
    buildType(subProj_bt_73_1)
    buildType(subProj_bt_73_4)
    buildType(subProj_bt_73_5)
    buildType(subProj_bt_73_2)
    buildType(subProj_bt_73_3)
})
