package subProj_864

import subProj_864.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_864")
    name = "subProj 864"

    buildType(subProj_bt_864_1)
    buildType(subProj_bt_864_0)
    buildType(subProj_bt_864_5)
    buildType(subProj_bt_864_4)
    buildType(subProj_bt_864_3)
    buildType(subProj_bt_864_2)
})
