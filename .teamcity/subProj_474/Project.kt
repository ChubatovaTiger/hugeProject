package subProj_474

import subProj_474.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_474")
    name = "subProj 474"

    buildType(subProj_bt_474_5)
    buildType(subProj_bt_474_4)
    buildType(subProj_bt_474_3)
    buildType(subProj_bt_474_2)
    buildType(subProj_bt_474_1)
    buildType(subProj_bt_474_0)
})
