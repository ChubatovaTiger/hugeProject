package subProj_1465

import subProj_1465.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1465")
    name = "subProj 1465"

    buildType(subProj_bt_1465_4)
    buildType(subProj_bt_1465_5)
    buildType(subProj_bt_1465_2)
    buildType(subProj_bt_1465_3)
    buildType(subProj_bt_1465_0)
    buildType(subProj_bt_1465_1)
})
