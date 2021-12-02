package subProj_350

import subProj_350.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_350")
    name = "subProj 350"

    buildType(subProj_bt_350_2)
    buildType(subProj_bt_350_3)
    buildType(subProj_bt_350_4)
    buildType(subProj_bt_350_5)
    buildType(subProj_bt_350_0)
    buildType(subProj_bt_350_1)
})
