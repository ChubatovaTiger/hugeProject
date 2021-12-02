package subProj_1935

import subProj_1935.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1935")
    name = "subProj 1935"

    buildType(subProj_bt_1935_3)
    buildType(subProj_bt_1935_2)
    buildType(subProj_bt_1935_1)
    buildType(subProj_bt_1935_0)
    buildType(subProj_bt_1935_5)
    buildType(subProj_bt_1935_4)
})
