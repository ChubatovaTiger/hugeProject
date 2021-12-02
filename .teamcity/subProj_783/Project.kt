package subProj_783

import subProj_783.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_783")
    name = "subProj 783"

    buildType(subProj_bt_783_0)
    buildType(subProj_bt_783_1)
    buildType(subProj_bt_783_4)
    buildType(subProj_bt_783_5)
    buildType(subProj_bt_783_2)
    buildType(subProj_bt_783_3)
})
