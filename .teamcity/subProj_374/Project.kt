package subProj_374

import subProj_374.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_374")
    name = "subProj 374"

    buildType(subProj_bt_374_5)
    buildType(subProj_bt_374_4)
    buildType(subProj_bt_374_1)
    buildType(subProj_bt_374_0)
    buildType(subProj_bt_374_3)
    buildType(subProj_bt_374_2)
})
