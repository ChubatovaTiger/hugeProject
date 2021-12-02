package subProj_506

import subProj_506.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_506")
    name = "subProj 506"

    buildType(subProj_bt_506_5)
    buildType(subProj_bt_506_3)
    buildType(subProj_bt_506_4)
    buildType(subProj_bt_506_1)
    buildType(subProj_bt_506_2)
    buildType(subProj_bt_506_0)
})
