package subProj_428

import subProj_428.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_428")
    name = "subProj 428"

    buildType(subProj_bt_428_1)
    buildType(subProj_bt_428_0)
    buildType(subProj_bt_428_3)
    buildType(subProj_bt_428_2)
    buildType(subProj_bt_428_5)
    buildType(subProj_bt_428_4)
})
