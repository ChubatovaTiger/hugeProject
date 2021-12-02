package subProj_348

import subProj_348.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_348")
    name = "subProj 348"

    buildType(subProj_bt_348_1)
    buildType(subProj_bt_348_2)
    buildType(subProj_bt_348_3)
    buildType(subProj_bt_348_4)
    buildType(subProj_bt_348_0)
    buildType(subProj_bt_348_5)
})
