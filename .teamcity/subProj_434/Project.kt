package subProj_434

import subProj_434.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_434")
    name = "subProj 434"

    buildType(subProj_bt_434_0)
    buildType(subProj_bt_434_2)
    buildType(subProj_bt_434_1)
    buildType(subProj_bt_434_4)
    buildType(subProj_bt_434_3)
    buildType(subProj_bt_434_5)
})
