package subProj_480

import subProj_480.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_480")
    name = "subProj 480"

    buildType(subProj_bt_480_3)
    buildType(subProj_bt_480_2)
    buildType(subProj_bt_480_1)
    buildType(subProj_bt_480_0)
    buildType(subProj_bt_480_5)
    buildType(subProj_bt_480_4)
})
