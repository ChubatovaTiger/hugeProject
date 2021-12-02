package subProj_687

import subProj_687.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_687")
    name = "subProj 687"

    buildType(subProj_bt_687_0)
    buildType(subProj_bt_687_1)
    buildType(subProj_bt_687_2)
    buildType(subProj_bt_687_3)
    buildType(subProj_bt_687_4)
    buildType(subProj_bt_687_5)
})
