package subProj_539

import subProj_539.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_539")
    name = "subProj 539"

    buildType(subProj_bt_539_5)
    buildType(subProj_bt_539_4)
    buildType(subProj_bt_539_3)
    buildType(subProj_bt_539_2)
    buildType(subProj_bt_539_1)
    buildType(subProj_bt_539_0)
})
