package subProj_956

import subProj_956.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_956")
    name = "subProj 956"

    buildType(subProj_bt_956_3)
    buildType(subProj_bt_956_2)
    buildType(subProj_bt_956_5)
    buildType(subProj_bt_956_4)
    buildType(subProj_bt_956_1)
    buildType(subProj_bt_956_0)
})
