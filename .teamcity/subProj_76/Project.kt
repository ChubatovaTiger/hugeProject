package subProj_76

import subProj_76.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_76")
    name = "subProj 76"

    buildType(subProj_bt_76_1)
    buildType(subProj_bt_76_2)
    buildType(subProj_bt_76_0)
    buildType(subProj_bt_76_5)
    buildType(subProj_bt_76_3)
    buildType(subProj_bt_76_4)
})
