package subProj_1718

import subProj_1718.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1718")
    name = "subProj 1718"

    buildType(subProj_bt_1718_5)
    buildType(subProj_bt_1718_3)
    buildType(subProj_bt_1718_4)
    buildType(subProj_bt_1718_1)
    buildType(subProj_bt_1718_2)
    buildType(subProj_bt_1718_0)
})
