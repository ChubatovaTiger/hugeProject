package subProj_1864

import subProj_1864.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1864")
    name = "subProj 1864"

    buildType(subProj_bt_1864_3)
    buildType(subProj_bt_1864_4)
    buildType(subProj_bt_1864_1)
    buildType(subProj_bt_1864_2)
    buildType(subProj_bt_1864_0)
    buildType(subProj_bt_1864_5)
})
