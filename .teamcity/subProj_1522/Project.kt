package subProj_1522

import subProj_1522.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1522")
    name = "subProj 1522"

    buildType(subProj_bt_1522_0)
    buildType(subProj_bt_1522_1)
    buildType(subProj_bt_1522_4)
    buildType(subProj_bt_1522_5)
    buildType(subProj_bt_1522_2)
    buildType(subProj_bt_1522_3)
})
