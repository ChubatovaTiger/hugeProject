package subProj_1504

import subProj_1504.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1504")
    name = "subProj 1504"

    buildType(subProj_bt_1504_3)
    buildType(subProj_bt_1504_2)
    buildType(subProj_bt_1504_5)
    buildType(subProj_bt_1504_4)
    buildType(subProj_bt_1504_1)
    buildType(subProj_bt_1504_0)
})
