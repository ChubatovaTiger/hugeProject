package subProj_1679

import subProj_1679.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1679")
    name = "subProj 1679"

    buildType(subProj_bt_1679_5)
    buildType(subProj_bt_1679_3)
    buildType(subProj_bt_1679_4)
    buildType(subProj_bt_1679_1)
    buildType(subProj_bt_1679_2)
    buildType(subProj_bt_1679_0)
})
