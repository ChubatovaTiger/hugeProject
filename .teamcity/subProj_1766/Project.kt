package subProj_1766

import subProj_1766.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1766")
    name = "subProj 1766"

    buildType(subProj_bt_1766_4)
    buildType(subProj_bt_1766_5)
    buildType(subProj_bt_1766_0)
    buildType(subProj_bt_1766_1)
    buildType(subProj_bt_1766_2)
    buildType(subProj_bt_1766_3)
})
