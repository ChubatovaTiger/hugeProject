package subProj_717

import subProj_717.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_717")
    name = "subProj 717"

    buildType(subProj_bt_717_2)
    buildType(subProj_bt_717_1)
    buildType(subProj_bt_717_0)
    buildType(subProj_bt_717_5)
    buildType(subProj_bt_717_4)
    buildType(subProj_bt_717_3)
})
